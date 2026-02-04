
interface MealPlan {
    void mealType();
}
class VegetarianMeal implements MealPlan {
    public void mealType() {
        System.out.println("Vegetarian Meal Plan");
    }
}

class VeganMeal implements MealPlan {
    public void mealType() {
        System.out.println("Vegan Meal Plan");
    }
}

class KetoMeal implements MealPlan {
    public void mealType() {
        System.out.println("Keto Meal Plan");
    }
}
class Meal<T extends MealPlan> {
    T plan;

    Meal(T plan) {
        this.plan = plan;
    }

    void showMeal() {
        plan.mealType();
    }
}

class MealUtil {
    static <T extends MealPlan> void generateMeal(T meal) {
        meal.mealType();
    }
}
public class ques4 {
    public static void main(String[] args) {
        Meal<VeganMeal> meal1 = new Meal<>(new VeganMeal());
        meal1.showMeal();

        MealUtil.generateMeal(new KetoMeal());
    }
}
