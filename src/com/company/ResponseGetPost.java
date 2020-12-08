package com.company;


import java.util.ArrayList;
import java.util.List;

public class ResponseGetPost {
    public String code;
    public String message;
    public String is_blocked;
    public String can_comment;
    Author author;
    Data data;


}
class Data{
    String id;
    String described;
    String created;
    String modified;
    String like;
    String comment;
    String is_liked;

}
class Author{
    String id;
    String name;
    String avatar;
    String online;
}