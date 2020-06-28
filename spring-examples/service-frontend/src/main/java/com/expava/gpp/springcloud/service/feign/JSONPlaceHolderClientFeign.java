package com.expava.gpp.springcloud.service.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.expava.gpp.springcloud.model.Post;

@FeignClient(value = "jplaceholder", url = "https://jsonplaceholder.typicode.com/")
public interface  JSONPlaceHolderClientFeign {

	@RequestMapping(method = RequestMethod.GET, value = "/posts")
    List<Post> getPosts();
 
    @RequestMapping(method = RequestMethod.GET, value = "/posts/{postId}", produces = "application/json")
    Post getPostById(@PathVariable("postId") Long postId);
}
