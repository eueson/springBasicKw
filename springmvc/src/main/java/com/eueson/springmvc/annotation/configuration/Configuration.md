## @Configuration 注解
声明当前类是一个配置类，用来代替传统的XML配置文件。其中的 proxyBeanMethods 属性有两个取值，作用如下：
* true：表示 @Configuration 声明的类产生 Cglib 代理对象，同时保证每个 @Bean 方法不论被调用多少次，返回的组件都是单例的。
* false：表示 @Configuration 声明的类产生普通对象，同时每个 @Bean 方法不论被调用多少次，返回的组件都是新创建的。

在不声明 proxyBeanMethods 属性时，默认为 true。