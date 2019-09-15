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
#### 1、@JSONField 的作用对象:                       
- 1. Field                          
- 2. Setter 和 Getter 方法                                 

注意：FastJson 在进行操作时，是根据 getter 和 setter 的方法进行的，并不是依据 Field 进行。                       
注意：若属性是私有的，必须有 set 方法。否则无法反序列化。                         
```java
package com.alibaba.fastjson.annotation;

public @interface JSONField {
    // 配置序列化和反序列化的顺序，1.1.42版本之后才支持
    int ordinal() default 0;

     // 指定字段的名称
    String name() default "";

    // 指定字段的格式，对日期格式有用
    String format() default "";

    // 是否序列化
    boolean serialize() default true;

    // 是否反序列化
    boolean deserialize() default true;
}
```

#### 2、JSONField 配置方式
配置在 getter/setter 上                 
```java
public class A {
      private int id;
 
      @JSONField(name="ID")
      public int getId() {return id;}
      @JSONField(name="ID")
      public void setId(int value) {this.id = id;}
}
```

配置在 field 上
```java
 public class A {
      @JSONField(name="ID")
      private int id;
 
      public int getId() {return id;}
      public void setId(int value) {this.id = id;}
 }
```

日期格式化：                      
```java
public class A {
      // 配置date序列化和反序列使用yyyyMMdd日期格式
      @JSONField(format="yyyyMMdd")
      public Date date;
 }
```


使用 serialize/deserialize 指定字段不序列化
```java
public class A {
      @JSONField(serialize=false)
      public Date date;
}
```

使用 ordinal 指定字段的顺序              
```java
public static class VO {
    @JSONField(ordinal = 3)
    private int f0;

    @JSONField(ordinal = 2)
    private int f1;

    @JSONField(ordinal = 1)
    private int f2;
}
```

### 反序列化
FastJson 还支持 BeanToArray 序列化功能：                 
```java
String jsonOutput= JSON.toJSONString(listOfPersons, SerializerFeature.BeanToArray);

// 结果
[
    [
        15,
        1469003271063,
        "John Doe"
    ],
    [
        20,
        1469003271063,
        "Janette Doe"
    ]
]
```

### 创建 JSON 对象
创建 JSON 对象非常简单，只需使用 `JSONObject（fastJson提供的json对象） 和 JSONArray（fastJson提供json数组对象）` 对象即可。                           
```
@Test
public void whenGenerateJson_thanGenerationCorrect() throws ParseException {
    JSONArray jsonArray = new JSONArray();
    for (int i = 0; i < 2; i++) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("AGE", 10);
        jsonObject.put("FULL NAME", "Doe " + i);
        jsonObject.put("DATE OF BIRTH", "2016/12/12 12:12:12");
        jsonArray.add(jsonObject);
    }
    String jsonOutput = jsonArray.toJSONString();
}

// 结果
[
   {
      "AGE":"10",
      "DATE OF BIRTH":"2016/12/12 12:12:12",
      "FULL NAME":"Doe 0"
   },
   {
      "AGE":"10",
      "DATE OF BIRTH":"2016/12/12 12:12:12",
      "FULL NAME":"Doe 1"
   }
]
```





