package com.eigenbaumarkt.spring5_mongodb_recipe_app.commands;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class CategoryCommand {
    private String id;
    private String description;
}
