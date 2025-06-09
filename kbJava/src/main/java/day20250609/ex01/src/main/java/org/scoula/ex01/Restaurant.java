package org.scoula.ex01;

import org.scoula.ex01.Chef;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import lombok.Data;


@Component
@Data
public class Restaurant {

    @Autowired // 의존성 주입
    private Chef chef;
}