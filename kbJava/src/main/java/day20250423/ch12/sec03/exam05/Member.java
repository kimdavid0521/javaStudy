package day20250423.ch12.sec03.exam05;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Member {
    private String id;
    private String name;
    private int age;
}
