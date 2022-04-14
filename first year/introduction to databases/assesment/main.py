import option_1
import sqlite3

db_file = "C:/Users/Pipo-Admin/Desktop/university/first year/introduction to databases/assesment/orinco.db"
db = sqlite3.connect(db_file)
cursor = db.cursor()
def id_checker():
    counter = 0
    result = 0
    id = int(input("plese enter your id :"))
    sql_query = " SELECT shopper_id \
                    FROM shoppers"
    cursor.execute(sql_query)
    dept_row = cursor.fetchall()

    emplist = []
    for a in dept_row:
        emplist.append(a[0])
    while(counter < len(emplist)):
        if emplist[counter] == id:
            result = 1
        counter += 1
    db.close()
    if result == 1:
        print(f"\nWellcome to ORINOCO :\n")
        menu()
    else:
        print("Sorry your ID is invalid!")
def menu():
        print("ORINOCO – SHOPPER MAIN MENU")
        print("____________________________")
        print("1.   Display your order history")
        print("2.   Add an item to your basket")
        print("3.   View your basket")
        print("4.   Change the quantity of an item in your basket")
        print("5.   Remove an item from your basket")
        print("6.   Checkout")
        print("7.   Exit")
        option = int(input("plese select a option : \n"))
        if option == 1:
            option_1.ordered_history()

if __name__ == '__main__':
    id_checker()
