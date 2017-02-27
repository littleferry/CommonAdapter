# 通用的ListAdapter适配器，针对目前的应用，几乎所有的界面都可以通过ListView来显示，整个应用只需要一个Adapter即可，不同页面只需要组装不同的数据就可以，思路如下：
# 1. 通过数据来驱动显示，由数据对象来决定对应的View显示
# 2. 界面显示采用二维数组的方式填充数据
# 3. Adapter接收继承自CellListDataBase的数据对象数组，其中每个继承CellListDataBase的对象，内部还有一个CellDataBase的对象数据数组
# 4. 最小数据单元是CellDataBase，从此基类派生的实现类放到数组中，提供newGroup方法返回

# 实例代码演示了从1x1到5x1的五种风格的Cell界面，按照屏幕宽度，每个最小单元格都是正方形，如下图：
![](https://github.com/littleferry/CommonAdapter/blob/master/screenshot/Screenshot_2017-02-27-16-30-31.png)

# 扩展其他类型方式：
# 创建需要扩展的数据对象，分别从CellListDataBase，CellDataBase继承，实现对应的newCellGroup， newGroup，可以参考：CellListDataNx1，CellDataNx1
# 创建对应的CellListGroupBase，CellGroupBase的派生类，可以参考CellListGroupNx1和CellListDataNx1
# 把需要显示的数据对象放到ArrayList<CellListDataBase> 数组中，调用Adapter的resetList或replaceList方法即可

# 所以一个应用的开发过程，是不断完善CommonAdapter支持的Group，这些Group可以复用在其他项目中，不需要重复造轮子，达到一定的积累后，在应用中新增页面，将会是非常轻松简单的事情，只需要关注界面上各个部分对应的数据对象，放到数组中，界面就能根据数据数组按要求显示出来
