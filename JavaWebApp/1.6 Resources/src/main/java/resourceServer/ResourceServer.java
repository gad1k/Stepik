package resourceServer;

import resource.TestResource;
import sax.ReadXMLFileSAX;

public class ResourceServer implements ResourceServerI {
    private TestResource testResource;

    public void readXML(String pathToFile) {
        testResource = (TestResource) ReadXMLFileSAX.readXML(pathToFile);
    }

    @Override
    public String getName() {
        return testResource.getName();
    }

    @Override
    public int getAge() {
        return testResource.getAge();
    }
}