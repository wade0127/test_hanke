package com.hanke.test.bean.fruit;

/**
 * @BelongsProject: test_hanke
 * @BelongsPackage: com.hanke.test.bean
 * @Author: wade
 * @CreateTime: 2023-11-07  14:07
 * @Description: ˮ������
 * @Version: 1.0
 */
public abstract class Fruit{

    private FruitType type;
    private String name;
    private int unitPrice;

    public Fruit(FruitType type, String name, int unitPrice) {
        this.type = type;
        this.name = name;
        this.unitPrice = unitPrice;
    }

    public FruitType getType() {
        return type;
    }

    public void setType(FruitType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }
}
