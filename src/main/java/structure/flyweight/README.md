#### 享元模式 (Flyweight)

> 运用共享技术有效的支持大量细粒度的对象；

#### 特点

- 享元模式可以避免大量非常相似类的开销；
- 内部状态：存储于ConcreteFlyweight对象中；
- 外部状态：由客户端对象存储，调用时传入；
- 如果大量实例之间只有少数参数不同可以把这部分的数据定义为外部状态，外部状态由调用方法时传递进来；
- 使用享元模式是为了将实例个数大大减少节约资源的目的；
- 当一个应用需要使用大量的对象，而这些对象的大多数数据可以使用外部状态，且对象难以存储时就可以考虑享元模式；

#### 设计模式的使用方法

- 定义抽象享元类或者接口；
- 实现具体的享元类和具体的不共享对象；
- 实现享元工厂，以一定策略提供享元对象；

#### 设计模式的实现方法

- 调用享元工厂获取享元对象使用；


#### 设计模式举例

- 游戏设计中，围棋的棋子对象可以使用享元模式，其外部对象是棋子的坐标，享元实例一个白的一个黑的，可以将实例个数压缩到2个；