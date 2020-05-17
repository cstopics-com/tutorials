package com.expava.gpp.springcloud.service.feign;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.expava.gpp.springcloud.model.Post;

@Service
public class JSONPlaceHolderServiceFeign {

	@Autowired
    private JSONPlaceHolderClientFeign jsonPlaceHolderClientFeign;

    public List<Post> getPosts() {
        return jsonPlaceHolderClientFeign.getPosts();
    }

    public Post getPostById(Long id) {
        return jsonPlaceHolderClientFeign.getPostById(id);
    }
}
