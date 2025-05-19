Tarea #1 
Tema: Selenium 
Subtema: Instalación de Selenium, introducción a los localizadores 
 
Ejercicio 1: 
a)	Explicar con mis palabras que hace la instrucción “WebDriver driver = new 
ChromeDriver();” 

R=Sirve para inicializar el driver y abrir un ventana del navegador de tipo Chrome. 
ejemplo
![img.png](img.png)

b)	Explicar con mis palabras que hace la instrucción “WebElement classExampleTextbox = driver.findElement(By.id("name"));” 
 
R=Esta instrucción nos ayuda a buscar un elemento HTML en una pagina del navegador chrome que tenga el localizador Selenium (ejemplo  id="name")  y lo guarda en la variable llamada classExampleTextbox
Así puedes interactuar con ese elemento (por ejemplo, buscar, leer o modificar).

c)	Cuáles son las formas en las que podemos localizar elementos en selenium? 
R= Se pueden encontrar utilizando los siguientes localizadores de selenium que son:
1-	id
2-	name
3-	cssSelector
4-	xpath
5-	className
6-	tagName
7-	linkText
8-	partialLinkText
