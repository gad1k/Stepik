package sec_05_02.step_03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    static List<String[]> conf = new ArrayList<>();
    static String beginVertex, nextVertex, finishVertex;
    static int finishValue = -1;

    public static void main(String[] args) throws IOException {
        initialize();

        while (Vertex.vertexes.size() > 0) {
            Edge minEdge = null;
            Vertex startVertex = null, endVertex = null;

            Iterator iterator = Vertex.vertexes.iterator();
            while (iterator.hasNext()) {
                Vertex vertex = (Vertex) iterator.next();
                if (vertex.name.equals(nextVertex)) {
                    if ((minEdge = vertex.getMinEdge()).nextVertex == null)
                        break;
                    if (minEdge.nextVertex.equals(finishVertex))
                        finishValue = minEdge.value;
                    startVertex = vertex;
                    endVertex = vertex.getEndVertex(minEdge);
                    break;
                }
            }
            if (minEdge.nextVertex == null)
                break;
            nextVertex = Vertex.createNewVertex(startVertex, endVertex, minEdge);
        }
        System.out.println(finishValue);
    }

    static void initialize() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        int isAdded = 0;

        while ((line = reader.readLine()) != null) {
            String[] parsedLine = line.split(" ");
            if (parsedLine.length == 2)
                conf.add(new String[] {parsedLine[0], parsedLine[1]});
            else {
                for (Vertex vertex : Vertex.vertexes) {
                    isAdded = 0;
                    if (vertex.name.equals(parsedLine[0])) {
                        vertex.listEdges.add(new Edge(parsedLine[1], Integer.parseInt(parsedLine[2])));
                        isAdded = 1;
                    }
                }
                if (isAdded == 0)
                    Vertex.vertexes.add(new Vertex(parsedLine[0], new Edge(parsedLine[1], Integer.parseInt(parsedLine[2]))));
            }
        }

        nextVertex = conf.get(1)[0];
        finishVertex = conf.get(1)[1];

        if (isExistVertex(nextVertex) == 0)
            Vertex.vertexes.add(new Vertex(nextVertex));

        if (isExistVertex(finishVertex) == 0)
            Vertex.vertexes.add(new Vertex(finishVertex));
    }

    static int isExistVertex(String beginFinishVertex) {
        int count = 0;
        for (Vertex vertex : Vertex.vertexes)
            if (vertex.name.equals(beginFinishVertex))
                count++;
        return count;
    }
}

class Vertex {
    static List<Vertex> vertexes = new ArrayList<>();

    String name;
    List<Edge> listEdges = new ArrayList<>();

    Vertex(String name) {
        this.name = name;
    }

    Vertex(String name, Edge edge) {
        this.name = name;
        listEdges.add(edge);
    }

    Vertex(Vertex startVertex, Vertex endVertex, Edge minEdge) {
        this.name = startVertex.name + endVertex.name;
        for (Edge edge : startVertex.listEdges)
            this.listEdges.add(edge);
        for (Edge edge : endVertex.listEdges)
            this.listEdges.add(new Edge(edge.nextVertex, edge.value + minEdge.value));
        this.listEdges.remove(minEdge);
    }

    Edge getMinEdge() {
        Edge minEdge = new Edge(null, Integer.MAX_VALUE);
        Iterator<Edge> iterator = listEdges.iterator();
        while (iterator.hasNext()) {
            Edge edge = iterator.next();
            if (isExistVertex(edge) == 0) {
                iterator.remove();
                continue;
            }
            if (edge.value < minEdge.value)
                minEdge = edge;
        }
        return minEdge;
    }

    Vertex getEndVertex(Edge minEdge) {
        Vertex endVertex = null;
        for (Vertex vertex : vertexes)
            if (vertex.name.equals(minEdge.nextVertex)) {
                endVertex = vertex;
                break;
            }
        return endVertex;
    }

    int isExistVertex(Edge edge) {
        int count = 0;
        for (Vertex vertex : Vertex.vertexes)
            if (vertex.name.equals(edge.nextVertex))
                count++;
        return count;
    }

    static String createNewVertex(Vertex startVertex, Vertex endVertex, Edge minEdge) {
        vertexes.add(new Vertex(startVertex, endVertex, minEdge));
        Iterator iterator = Vertex.vertexes.iterator();
        while (iterator.hasNext()) {
            Vertex vertex = (Vertex) iterator.next();
            if (vertex.name.equals(startVertex.name) || vertex.name.equals(endVertex.name))
                iterator.remove();
        }
        return startVertex.name + endVertex.name;
    }
}

class Edge {
    String nextVertex;
    int value;

    Edge(String nextVertex, int value) {
        this.nextVertex = nextVertex;
        this.value = value;
    }
}