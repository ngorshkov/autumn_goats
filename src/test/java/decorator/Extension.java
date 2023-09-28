package decorator;

import org.junit.jupiter.api.extension.AfterTestExecutionCallback;
import org.junit.jupiter.api.extension.BeforeTestExecutionCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

public class Extension implements BeforeTestExecutionCallback, AfterTestExecutionCallback {

    @Override
    public void beforeTestExecution(ExtensionContext context) {
        System.out.println("Test run: " + context.getDisplayName());
    }

    @Override
    public void afterTestExecution(ExtensionContext context) {
        System.out.println("Test end: " + context.getDisplayName());
    }
}
