package org.apache.sling.sample.jcrmock;

import org.apache.sling.testing.mock.sling.ResourceResolverType;
import org.apache.sling.testing.mock.sling.junit.SlingContext;
import org.junit.Rule;
import org.junit.Test;

public class ImportTest {

    @Rule
    public final SlingContext context = new SlingContext(ResourceResolverType.JCR_MOCK);

    @Test
    public void importSlingTest() {

        // data extracted from http://localhost:8080/sling-test.infinity.json

        context.load().json("/sling-test.json", "/sling-test");

    }
}
