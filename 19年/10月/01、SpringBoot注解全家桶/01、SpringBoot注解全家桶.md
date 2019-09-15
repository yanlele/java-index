## SpringBoot注解全家桶

### spring web mvc 注解
#### `@RequestMapping`                           
- value:映射的请求URL或者其别名
- method:兼容HTTP的方法名
- params:根据HTTP参数的存在、缺省或值对请求进行过滤
- header:根据HTTP Header的存在、缺省或值对请求进行过滤
- consume:设定在HTTP请求正文中允许使用的媒体类型
- product:在HTTP响应体中允许使用的媒体类型

#### `@RequestBody`
```java
@RequestController
public class UserController{
    @Autowired
    private UserService userService;
    
    @PostMapper("/users")
    public User createUser(@Valid @RequestBody User user) {
        return userService.save(user);
    }
}
```

#### `@GetMapping`

#### `@PostMapping`

#### `@PutMapping`

#### `@DeleteMapping`

#### `@PatchMapping`

#### `@ControllerAdvice`
- 是@Component注解的一个延伸注解，Spring会自动扫描并检测被
- 需要和 `@ExceptionHandler、@InitBinder以及@ModelAttribute` 注解搭配使用，主要是用来处理控制器所抛出的异常信息。
- 我们需要定义一个被 `@ControllerAdvice` 所标注的类，在该类中，定义一个用于处理具体异常的方法，并使用 `@ExceptionHandler` 注解进行标记
- 可以使用`@InitBinder`在类中进行全局的配置，还可以使用`@ModelAttribute`配置与视图相关的参数                              
![dmeo1](https://mmbiz.qpic.cn/mmbiz_png/oTKHc6F8tsh88UVu8O3FqTRicNRD2eWVJibibt00sA4vQ9nX0pzMyZyNbfGPMicibNeYBfvOkIEXia4I9bME0EkcByCA/640?wxfrom=5&wx_lazy=1&wx_co=1)

#### `@ResponseBody`
- `@ResponseBody`注解只能用在被`@Controller`注解标记的类中。
- `@RestController`相当于是`@Controller和@ResponseBody`的组合注解。

#### `@ExceptionHandler`
- @ExceptionHander注解用于标注处理特定类型异常类所抛出异常的方法。
- 当控制器中的方法抛出异常时，Spring会自动捕获异常，并将捕获的异常信息传递给被@ExceptionHandler标注的方法。

#### `@ResponseStatus`
- @ResponseStatus注解可以标注请求处理方法。
- 使用此注解，可以指定响应所需要的HTTP STATUS。特别地，我们可以使用HttpStauts类对该注解的value属性进行赋值。

#### `@PathVariable`
- @PathVariable注解是将方法中的参数绑定到请求URI中的模板变量上。
- 可以通过@RequestMapping注解来指定URI的模板变量，然后使用@PathVariable注解将方法中的参数绑定到模板变量上。
- 特别地，@PathVariable注解允许我们使用value或name属性来给参数取一个别名。
- 模板变量名需要使用“{ }”进行包裹，如果方法的参数名与URI模板变量名一致，则在@PathVariable中就可以省略别名的定义。


#### `@RequestParam`
- @RequestParam注解用于将方法的参数与Web请求的传递的参数进行绑定。
- @RequestParam可以轻松的访问HTTP请求参数的值。
- 如果传递的参数为空，还可以通过`defaultValue`设置一个默认值。

#### `@Controller`
- @Controller是@Component注解的一个延伸，Spring会自动扫描并配置被该注解标注的类。


#### `@RestController`
- @RestController是在Spring 4.0开始引入的，这是一个特定的控制器注解。
- 相当于@Controller和@ResponseBody的快捷方式。


#### `@ModelAttribute`
- 通过此注解，可以通过模型索引名称来访问已经存在于控制器中的model。
- 如果参数名与模型具有相同的名字，则不必指定索引名称
- 特别地，如果使用@ModelAttribute对方法进行标注，Spring会将方法的返回值绑定到具体的Model上。


#### `@CrossOrigin`
- @CrossOrigin注解将为请求处理类或请求处理方法提供跨域调用支持。

#### `@InitBinder`
- @InitBinder注解用于标注初始化WebDataBinider的方法，该方法用于对Http请求传递的表单数据进行处理，如时间格式化、字符串处理等。


### SpringBean注解

#### `@ComponentScan`
- @ComponentScan注解用于配置Spring需要扫描的被组件注解注释的类所在的包。可以通过配置其basePackages属性或者value属性来配置需要扫描的包路径。

#### `@Component`
- @Component注解用于标注一个普通的组件类，它没有明确的业务范围，只是通知Spring被此注解的类需要被纳入到Spring Bean容器中并进行管理。

#### `@Service`
- @Service注解是@Component的一个延伸（特例），它用于标注业务逻辑类。

#### `@Repository`
- @Repository注解也是@Component注解的延伸，与@Component注解一样，被此注解标注的类会被Spring自动管理起来，@Repository注解用于标注DAO层的数据持久化类。


### Spring Dependency Inject 与 Bean Scops注解

#### `@DependsOn`
- @DependsOn注解可以配置Spring IoC容器在初始化一个Bean之前，先初始化其他的Bean对象。

#### `@Bean`
- @Bean注解主要的作用是告知Spring，被此注解所标注的类将需要纳入到Bean管理工厂中。
- @Bean注解的用法很简单，在这里，着重介绍@Bean注解中initMethod和destroyMethod的用法。

#### `@Scope`
- @Scope注解可以用来定义@Component标注的类的作用范围以及@Bean所标记的类的作用范围。
- @Scope所限定的作用范围有：singleton、prototype、request、session、globalSession或者其他的自定义范围。
- 当@Scope的作用范围设置成Singleton时，被此注解所标注的类只会被Spring IoC容器初始化一次。











### 参考文章
- [Spring Boot 注解：全家桶快速通](https://mp.weixin.qq.com/s?__biz=Mzg2MjEwMjI1Mg==&mid=2247488546&idx=1&sn=6f0578cd15fa6bac7b4cb2ab179f715f&chksm=ce0da3a1f97a2ab7fb645a24766e6180c58139e961bd9473575182324eed8f9deffa5f05f103&mpshare=1&scene=23&srcid=&sharer_sharetime=1565135141265&sharer_shareid=1d216393e47b9d7ffafbaa4f54256b39#rd)