# UserProgram
שאלה 1: 

סעיף א': 
כתבו את המחלקה User המייצגת משתמש ברשת חברתית. 
במחלקה צריכים להיות השדות: 
String firstName – מייצגת את השם הפרטי של המשתמש
String lastName – מייצגת את שם המשפחה של המשתמש
int age – מייצגת את גיל המשתמש
int imagesCount – מייצגת את כמות התמונות שהעלה המשתמש
int videosCount – מייצגת את כמות הסרטונים שהעלה המשתמש
User[] following – מייצגת את רשימת המשתמשים שהמשתמש הנוכחי עוקב אחריהם
User[] followers מייצגת את רשימת המשתמשים שעוקבים אחרי המשתמש הנוכחי. 


סעיף ב': 
על מנת שהשם שבחר עבורו המשתמש ייחשב לתקין, אסור שיהיו מספרים בשם הפרטי של המשתמש ובשם המשפחה של המשתמש (כל תו אחר – מותר). 
כתבו את המתודה boolean isValidName(), המחזירה תשובה – האם שמו של המשתמש תקין. 

סעיף ג': 
על מנת שמשתמש יוגדר משתמש VIP, עליו לעמוד בתנאים הבאים: 
-שם המשתמש שלו תקין
-העלה לפחות 10 תמונות
-העלה לפחות 10 סרטונים
-יש לו לפחות 10 עוקבים עם שם משתמש תקין
הוסיפו את המתודה boolean isVip() המחזירה תשובה – האם המשתמש מוגדר VIP. 

סעיף ד': 
הגדרה: קשר בין שני משתמשים, ששניהם עוקבים זה אחרי זה, נקרא קשר הדדי. זאת אומרת, על מנת שקשר יהיה הדדי, על שני הצדדים בקשר לעקוב אחד אחרי השני. 
הוסיפו את המתודה int countMutualConnections() המחזירה את כמות הקשרים ההדדיים של משתמש. 


סעיף ה': 
משתמש מסוים מוגדר מזויף אם לפחות שלושה מבין התנאים שלהלן מתקיימים: 
-שם המשתמש שלו אינו תקין
-לא העלה אף תמונה
-לא העלה אף סרטון
-אין לו אף קשר הדדי
הוסיפו את המתודה void removeFakeUsers()
המתודה מסירה את כל המשתמשים המזויפים מתוך מערך ה-following ומתוך מערך ה-followers. 
