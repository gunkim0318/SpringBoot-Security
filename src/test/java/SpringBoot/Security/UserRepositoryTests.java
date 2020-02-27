package SpringBoot.Security;

import SpringBoot.Security.domain.Role;
import SpringBoot.Security.domain.User;
import SpringBoot.Security.domain.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class UserRepositoryTests {
    @Autowired
    private UserRepository userRepository;

    @Before
    public void before(){
        userRepository.deleteAll();

        User user = User.builder()
                .id("test01")
                .pw("test123")
                .role(Role.GUEST)
                .build();

        userRepository.save(user);
    }

    @Test
    public void testUserInsert(){
        User user = User.builder()
                .id("test01")
                .pw("test123")
                .role(Role.GUEST)
                .build();

        userRepository.save(user);
    }
    @Test
    public void testUserSelect(){
        List<User> list = userRepository.findAll();

        for(User user : list){
            log.info(user.toString());
        }
    }
    @Test
    public void testUserUpdate(){
        log.info(userRepository.findAll().toString());
        User user = userRepository.findById(5l).get();
        user.update("test456");

        userRepository.save(user);

        log.info("변경 확인 : "+userRepository.findById(5l));
    }
    @Test
    public void testUserDelete(){
        User deleteUser = userRepository.findById(1l).get();
        userRepository.delete(deleteUser);
    }
}