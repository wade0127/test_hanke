package com.hanke.test.bean.promotion;

import com.hanke.test.bean.ShoppingListItem;
import com.hanke.test.bean.fruit.Fruit;
import com.hanke.test.bean.fruit.FruitType;

import java.math.BigDecimal;

/**
 * @BelongsProject: test_hanke
 * @BelongsPackage: com.hanke.test.bean.promotion
 * @Author: wade
 * @CreateTime: 2023-11-07  14:10
 * @Description: 水果折扣类
 * @Version: 1.0
 */
public class FruitDiscount {

    private FruitType fruitType;
    private double discount;

    public FruitDiscount(FruitType fruitType, double discount) {
        //折扣范围在0-1之间
        if(this.discount < 0 || this.discount > 1.0) {
            throw new IllegalArgumentException("discount should in range [0, 1]");
        }
        this.fruitType = fruitType;
        this.discount = discount;
    }

    /**
     * @description:是否是支持打折的水果类型
     * @author: wade
     * @date: 2023/4/30 下午 16:16
     * @param: ShoppingListItem 订单明细类
     * @return: true-支持 false-不支持
     **/
    public boolean isSupport(ShoppingListItem item) {
        return item.getFruit().getType() == this.fruitType;
    }

    public FruitType getFruitType() {
        return fruitType;
    }

    public void setFruitType(FruitType fruitType) {
        this.fruitType = fruitType;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
