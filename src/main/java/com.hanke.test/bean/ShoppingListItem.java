package com.hanke.test.bean;

import com.hanke.test.bean.fruit.Fruit;

/**
 * @BelongsProject: test_hanke
 * @BelongsPackage: com.hanke.test.bean
 * @Author: wade
 * @CreateTime: 2023-11-07  14:13
 * @Description: ¶©µ¥Ã÷Ï¸
 * @Version: 1.0
 */
public class ShoppingListItem {

    private Fruit fruit;
    private int kiloes;

    public ShoppingListItem(Fruit fruit, int kiloes) {
        this.fruit = fruit;
        this.kiloes = kiloes;
    }

    public Fruit getFruit() {
        return fruit;
    }

    public void setFruit(Fruit fruit) {
        this.fruit = fruit;
    }

    public int getKiloes() {
        return kiloes;
    }

    public void setKiloes(int kiloes) {
        this.kiloes = kiloes;
    }
}
