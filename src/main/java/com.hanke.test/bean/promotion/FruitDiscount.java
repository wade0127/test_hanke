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
 * @Description: ˮ���ۿ���
 * @Version: 1.0
 */
public class FruitDiscount {

    private FruitType fruitType;
    private double discount;

    public FruitDiscount(FruitType fruitType, double discount) {
        //�ۿ۷�Χ��0-1֮��
        if(this.discount < 0 || this.discount > 1.0) {
            throw new IllegalArgumentException("discount should in range [0, 1]");
        }
        this.fruitType = fruitType;
        this.discount = discount;
    }

    /**
     * @description:�Ƿ���֧�ִ��۵�ˮ������
     * @author: wade
     * @date: 2023/4/30 ���� 16:16
     * @param: ShoppingListItem ������ϸ��
     * @return: true-֧�� false-��֧��
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
