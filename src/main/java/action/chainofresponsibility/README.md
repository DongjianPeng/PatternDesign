#### 职责链模式(Chain of responsibility)

> 将多个可能处理请求的对象抽象，形成一条链，处理时沿着这条链传递，直到有一个具体的处理对象处理完这个请求为止；

#### 特点

- 提交一个请求可以沿着设定好的职责链传递；
- 每个职责链的节点需要指定后继处理的节点；
- 客户端不需要关心是谁处理了这个请求；
- 方便增加一个处理请求的结构；
- 当心请求到了末端或者配置职责链错误之后请求都得不到处理的情况；


#### 设计模式的实现方法

- 将处理请求的结构抽象成接口，定义好处理请求的方法和设置下一个职责链节点的方法；
- 实现具体的处理请求类，定义好处理请求的方法，未处理时应当让下一个节点继续处理；

#### 设计模式的使用方法

- 初始化各个具体的处理类，并设定好它们之间的链式关系；
- 开始沿职责链处理请求；
