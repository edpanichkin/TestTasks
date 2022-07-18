package com.example.demoh2.service;

import com.example.demoh2.entity.Cat;
import com.example.demoh2.entity.Dog;
import com.example.demoh2.entity.Pet;
import com.example.demoh2.entity.Snake;
import com.example.demoh2.repo.PetRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class PetService {
  private final PetRepo petRepo;

  @Autowired
  public PetService(PetRepo petRepo) {
    this.petRepo = petRepo;
  }

  @Transactional
  public void init() {
  }

  public void sqlSearchAllFriendsById() {
    String sql = "SELECT * FROM pet join friends on pet.id = friends.friend_id_left where pet.id = 1";
  }

  //TODO более красивый способ max
  public void sqlSearchMaxFriendsCount() {
    String sql = "SELECT pet.id, count(friends.friend_id_right) as friend_count " +
            "FROM pet join friends on pet.id = friends.friend_id_left group by pet.id order by friends_count desc limit 1";
  }

  public void sqlSearchCatsByColorCountDesc_whereSizeMoreThan10() {
    String sql = "select color, count(color) as count from pet where dtype = 'Cat' and size >=8 group by color order by count desc";
  }

}
