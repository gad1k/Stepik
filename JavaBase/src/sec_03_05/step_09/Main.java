package sec_03_05.step_09;

public class Main {
    public Label checkLabels(TextAnalyzer[] analyzers, String text) {
        for (TextAnalyzer analyzer : analyzers)
            switch (analyzer.processText(text)) {
                case SPAM:
                    return Label.SPAM;
                case NEGATIVE_TEXT:
                    return Label.NEGATIVE_TEXT;
                case TOO_LONG:
                    return Label.TOO_LONG;
            }
        return Label.OK;
    }
}