package sia.tacocloud.entity;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import java.util.Date;
import java.util.List;

@Data
public class Taco {
    private long id;
    private Date createdAt=new Date();
    @NotNull
    @Size(min=5,message="Name must be at least 5 characters long")
    private  String name;
    @NotNull
    @Size(min=1,message="you must choose at least 1 ingredient")
    private List<Ingredient> ingredients;
}
