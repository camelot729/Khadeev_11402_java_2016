package ru.kpfu.itis.entity;

/**
 * Created by Kamil on 19.04.16.
 */

import javafx.beans.DefaultProperty;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "users")
public class UsersEntity extends PersonEntity{

}
