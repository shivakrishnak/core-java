// This code snippet contains errors related to Spring framework
// Your task is to:
// 1. Identify the errors in the code related to the Spring framework.
// 2. Explain each error and suggest the necessary corrections to fix them.
@RestController
public class UserController {
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public List<UserDTO> getUsers() {
        List<User> users = userService.getAllUsers();
        return UserMapper.mapToDTOList(users);
    }

    @PostMapping("/users")
    public ResponseEntity<String> createUser(CreateUserRequest request) {
        User user = UserMapper.mapToEntity(request);
        userService.createUser(user);
        return ResponseEntity.ok("User created successfully");
    }
}

@Service
public class UserService {
    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public void createUser(User user) {
        userRepository.save(user);
    }
}

public class UserRepository {
    private List<User> users;

    public UserRepository() {
        users = new ArrayList<>();
    }

    public List<User> findAll() {
        return users;
    }

    public void save(User user) {
        users.add(user);
    }
}

