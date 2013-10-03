package example;

/**
 * Created with IntelliJ IDEA.
 * User: 045B
 * Date: 01.10.13
 * Time: 14:23
 * To change this template use File | Settings | File Templates.
 */
public class HelloWorld {

    public String sayHelloWorldFrom(String from) {
        String result = "Hello, world, from " + from;
        System.out.println(result);
        return result;
    }

    public String mainPage () {
        String result = "mainPage";
        return result;
    }

}
