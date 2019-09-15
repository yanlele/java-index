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

















### 参考文章
- [Spring Boot 注解：全家桶快速通](https://mp.weixin.qq.com/s?__biz=Mzg2MjEwMjI1Mg==&mid=2247488546&idx=1&sn=6f0578cd15fa6bac7b4cb2ab179f715f&chksm=ce0da3a1f97a2ab7fb645a24766e6180c58139e961bd9473575182324eed8f9deffa5f05f103&mpshare=1&scene=23&srcid=&sharer_sharetime=1565135141265&sharer_shareid=1d216393e47b9d7ffafbaa4f54256b39#rd)