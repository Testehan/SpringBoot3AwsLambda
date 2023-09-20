package com.testehan.post;

import org.springframework.web.service.annotation.GetExchange;

import java.util.List;

public interface JsonPlaceholderService {

    // TODO Dan: check this out : https://www.baeldung.com/spring-6-http-interface
    @GetExchange("/posts")
    List<Post> loadPosts();
}
