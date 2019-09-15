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


### 参考文章
- [Spring Boot 注解：全家桶快速通](https://mp.weixin.qq.com/s?__biz=Mzg2MjEwMjI1Mg==&mid=2247488546&idx=1&sn=6f0578cd15fa6bac7b4cb2ab179f715f&chksm=ce0da3a1f97a2ab7fb645a24766e6180c58139e961bd9473575182324eed8f9deffa5f05f103&mpshare=1&scene=23&srcid=&sharer_sharetime=1565135141265&sharer_shareid=1d216393e47b9d7ffafbaa4f54256b39#rd)