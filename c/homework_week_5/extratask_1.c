#include <stdio.h>
#include <string.h>


typedef struct Ingredient ingredient;
typedef struct Recipe recipe;

struct Ingredient {
    char name[30];
    int amount;
};

struct Recipe {
    char name[100];
    struct Ingredient ingredients[10];
};


void output(recipe r) {
    printf("- %s:\n", r.name);
    
    int i = 0;
    while (strlen(r.ingredients[i].name) > 0) {
        printf("    - %dx %s\n", r.ingredients[i].amount, r.ingredients[i].name);
        i++;
    }
}


int main() {
    ingredient cabage;
    ingredient egg;
    ingredient moltage;
    strcpy(cabage.name, "cabage");
    cabage.amount = 10;
    strcpy(egg.name, "egg");
    egg.amount = 5;
    strcpy(moltage.name, "moltage");
    moltage.amount = 999;

    recipe molten_eggs;
    strcpy(molten_eggs.name, "Molten Eggs");
    molten_eggs.ingredients[0] = egg;
    molten_eggs.ingredients[1] = egg;
    molten_eggs.ingredients[2] = moltage;
    
    printf("Your recipes:\n");
    output(molten_eggs);

    return 0; 
}