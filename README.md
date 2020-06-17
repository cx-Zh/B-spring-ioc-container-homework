# 第一题

### 定义：
* @component 表示自动注册和装配bean，这里隐藏存在class和bean一对一的映射关系。
* @bean则是申明一个单一的bean，我们可以选择怎样去配置bean而非自动生成。

### 区别：
* 1 @Component使用类的路径扫描自动检测并配置Bean，而@Bean显式声明单个Bean，而不是自动执行。

* 2 @Component不会将Bean的声明与类定义解耦，而@Bean会。

* 3 @Component是类级别的注释，而@Bean是方法级别的注释，该方法的名称被用作Bean名称。（例如使用swtich方法）

* 4 @Component不必与@Configuration注释一起使用，但是@Configuration注释的类中必须使用@Bean注释。

* 5 如果类在spring容器之外，则不能使用@Component创建类的bean，而即使该类在spring容器之外，也可以使用@Bean创建类的bean。（例如使用第三方的库，或是注解的类内存在依赖）

* 6 @Component具有不同的专长，例如@ Controller，@ Repository和@Service，而@Bean没有专长。