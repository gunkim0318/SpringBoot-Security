package SpringBoot.Security.domain;

import lombok.*;

import javax.persistence.*;

@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
@Getter
@Entity
public class User {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long idx;

    @Column(nullable = false)
    private String id;

    @Column(nullable = false)
    private String pw;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role;

    @Builder
    public User(String id, String pw, Role role){
        this.id = id;
        this.pw = pw;
        this.role = role;
    }
    public void update(String pw){
        this.pw = pw;
    }
    public void update(String pw, Role role){
        update(pw);
        this.role = role;
    }
}