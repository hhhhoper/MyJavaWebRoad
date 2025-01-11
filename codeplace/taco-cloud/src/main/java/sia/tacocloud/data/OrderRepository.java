package sia.tacocloud.data;

import sia.tacocloud.entity.TacoOrder;

public  interface OrderRepository {
    TacoOrder save(TacoOrder order);
}
