pizza_menu = {'pepperoni':1 , 'mushroom':0.5, 'olive':0.5, 'anchovy': 2, 'ham': 1.5}
drink_menu = {'small':2, 'medium':3, 'large':3.5, 'tub': 3.75}
wing_menu = {10:5, 20:9, 40:17.5, 100:48}

def pizza_cost(pizza):
    cost_pizza = 13
    for item in pizza:
        cost_pizza += pizza_menu[item]
    return cost_pizza

def drink_cost(drink):
    cost_drink = 0
    for item in drink:
        cost_drink += drink_menu[item]
    return cost_drink

def wing_cost(wings):
    cost_wings = 0
    for item in wings:
        cost_wings += wing_menu[item]
    return cost_wings

def cost_calculator(*pizzas, drinks=[], wings=[], coupon=0):
    cost_order = 0
    final_cost = 0
    coupon_price = 0
    tax = 0
    for item in pizzas:
        cost_order += pizza_cost(item)
    cost_order += drink_cost(drinks) + wing_cost(wings)
    if coupon:
        coupon_price = coupon * cost_order
    tax = 0.0625*cost_order
    final_cost = cost_order + tax - coupon_price
    final_cost = round(final_cost, 2)
    return final_cost