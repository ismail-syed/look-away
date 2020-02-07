package App;

import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Launcher {
    public void launch() {
        String[] contextPaths = new String[] {"META-INF/app-context.xml"};
        new ClassPathXmlApplicationContext(contextPaths);
    }
}