package ru.yandex.qatools.examples.report;

import ru.yandex.qatools.properties.PropertyLoader;
import ru.yandex.qatools.properties.annotations.Property;
import ru.yandex.qatools.properties.annotations.Resource;

import java.net.URL;

/**
 * User: eroshenkoam
 * Date: 8/6/13, 2:13 PM
 */
@Resource.Classpath("webdriver.properties")
public class WebDriverProperties {

    @Property("webdriver.server")
    private URL server;

    public WebDriverProperties() {
        PropertyLoader.populate(this);
    }

    public URL getServer() {
        return server;
    }

}
