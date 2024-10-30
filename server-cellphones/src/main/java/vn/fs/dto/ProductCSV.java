package vn.fs.dto;

import lombok.Data;
import vn.fs.entity.Category;

@Data
public class ProductCSV {

    private String name;
    private int quantity;
    private Double price;
    private int discount;
    private String description;
    private Category category;

}
