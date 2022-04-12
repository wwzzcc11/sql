package edu.gdpu.mybatisdemo.dao;

import edu.gdpu.mybatisdemo.pojo.Person;


public interface PersonMapper {
    public Person queryPersonById(int id);
    public Person queryPersonWithCards(int id);
}
