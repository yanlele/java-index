## fastjson基础用法

### 安装依赖
```xml
<dependency>
    <groupId>com.alibaba</groupId>
    <artifactId>fastjson</artifactId>
    <version>1.2.60</version>
</dependency>
```


### java多想转为json

#### 基础使用
```java
public class Person {
     
    @JSONField(name = "AGE")
    private int age;
 
    @JSONField(name = "FULL NAME")
    private String fullName;
 
    @JSONField(name = "DATE OF BIRTH")
    private Date dateOfBirth;
 
    public Person(int age, String fullName, Date dateOfBirth) {
        super();
        this.age = age;
        this.fullName= fullName;
        this.dateOfBirth = dateOfBirth;
    }
 
    // 标准 getters & setters
}
```

可以使用 JSON.toJSONString() 将 Java 对象转换换为 JSON 对象：                     
```java
private List<Person> listOfPersons = new ArrayList<Person>();
 
@Before
public void setUp() {
    listOfPersons.add(new Person(15, "John Doe", new Date()));
    listOfPersons.add(new Person(20, "Janette Doe", new Date()));
}
 
@Test
public void whenJavaList_thanConvertToJsonCorrect() {
    String jsonOutput= JSON.toJSONString(listOfPersons);
}
```
输出结果：                   
```
[  
    {  
        "AGE":15,
        "DATE OF BIRTH":1468962431394,
        "FULL NAME":"John Doe"
    },
    {  
        "AGE":20,
        "DATE OF BIRTH":1468962431394,
        "FULL NAME":"Janette Doe"
    }
]
```

#### 自定义输出
我们还可以**自定义输出**，并控制字段的排序，日期显示格式，序列化标记等。                                      
接下来我们更新 bean 并添加几个字段：                                   
```java
@JSONField(name="AGE", serialize=false)
private int age;
 
@JSONField(name="LAST NAME", ordinal = 2)
private String lastName;
 
@JSONField(name="FIRST NAME", ordinal = 1)
private String firstName;
 
@JSONField(name="DATE OF BIRTH", format="dd/MM/yyyy", ordinal = 3)
private Date dateOfBirth;
```
- format 参数用于格式化 date 属性。
- 默认情况下， FastJson 库可以序列化 Java bean 实体， 但我们可以使用 serialize 指定字段不序列化。
- 使用 ordinal 参数指定字段的顺序

输出结果：                           
```
[
    {
        "FIRST NAME":"Doe",
        "LAST NAME":"Jhon",
        "DATE OF BIRTH":"19/07/2016"
    },
    {
        "FIRST NAME":"Doe",
        "LAST NAME":"Janette",
        "DATE OF BIRTH":"19/07/2016"
    }
]
```

### @JSONField
@JSONField 的作用对象:                       
- 1. Field                          
- 2. Setter 和 Getter 方法                                 




