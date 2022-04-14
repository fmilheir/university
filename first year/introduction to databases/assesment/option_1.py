import sqlite3

db_file = "C:/Users/Pipo-Admin/Desktop/university/first year/introduction to databases/assesment/orinco.db"
db = sqlite3.connect(db_file)
cursor = db.cursor()

def ordered_history():
    