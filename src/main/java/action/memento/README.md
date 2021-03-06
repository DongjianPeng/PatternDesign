#### 备忘录模式 (Memento)

> 在不破坏封装性的前提下，捕获一个对象的内在状态，在该对象之外保存这个状态，这样以后就可将该对象恢复到原先保存的状态；

#### 特点

- 备忘录模式适用于功能比较复杂，但需要维护或记录历史数据的类，或者保存的众多属性的一小部分时使用；

#### 设计模式的实现方法

- 确定需要保存的状态，以此新建一个此对象的备忘录类；
- 在需要保存状态的类中增加创建备忘录和从备忘录恢复的方法；
- 增加备忘录管理者类；

#### 设计模式的使用方法

- 使用对象创建备忘录，并交给备忘录管理者来管理；
- 需要使用备忘录时，从管理者获取备忘录交给对象的还原方法还原状态；
