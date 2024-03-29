const page = location.href;

/* 
 *	***************** Sort by Room Number Accending ****************
 */

const pageNumber = page.substring(49, 50);
const arrowPrevious = document.getElementById("arrowPrevious");
const urlBase = "Table?page="
const arrowNext = document.getElementById("arrowNext");

/* 
 *	***************** Sort ****************
 */

let sort;
if (page == "http://localhost:8080/BeggarOfficeJsp/Table?page=69"){
	sort = document.querySelectorAll("th a")[1];
} else {
	sort= document.querySelectorAll("th a")[0];
}
sort.style.color = "lightgray";
sort.style.pointerEvents = "none";

/* 
 *	***************** Highlight Pagnation ****************
 */

let link = document.getElementById("page1");
switch (pageNumber) {
  case "2":
    link = document.getElementById("page2");
    break;
  case "3":
     link = document.getElementById("page3");
    break;
  case "4":
    link = document.getElementById("page4");
    break;
  case "5":
    link = document.getElementById("page5");
    break;
  case "6":
    link = document.getElementById("page6");
    break;
  case "7":
    link = document.getElementById("page7");
    break;
}
link.className = "w3-button w3-yellow w3-hover-red";

/* 
 *	***************** Arrows Left ****************
 */

if (page == "http://localhost:8080/BeggarOfficeJsp/Table?page=1"){
	const arrowFirst = document.getElementById("pageFirst");
	arrowFirst.style.color = "lightgray";
	arrowFirst.style.pointerEvents = "none";
	arrowPrevious.className = "w3-button w3-hover-white w3-mobile";
	arrowPrevious.style.color = "lightgray";
	arrowPrevious.style.cursor = "auto";
}

/* 
 *	***************** Arrow Previous ****************
 */

arrowPrevious.addEventListener("click", onePageBack);
function onePageBack() {
	if (pageNumber != 1) {
		pageNumber--;
		const pageNumberPrevious = pageNumber;
		const pagePrevious = urlBase + pageNumberPrevious;
		location.href = pagePrevious;
	}
}

/* 
 *	***************** Arrow Next****************
 */

arrowNext.addEventListener("click", onePageForward);
function onePageForward() {
	if (pageNumber != 7) {
		pageNumber++;
		const pageNumberNext = pageNumber;
		const pageNext = urlBase + pageNumberNext;
		location.href = pageNext;
	}
}

/* 
 *	***************** Arrows Right ****************
 */

if (page == "http://localhost:8080/BeggarOfficeJsp/Table?page=7"){
	const arrowLast = document.getElementById("pageLast");
	arrowLast.style.color = "lightgray";
	arrowLast.style.pointerEvents = "none";
	arrowNext.className = "w3-button w3-hover-white w3-mobile";
	arrowNext.style.color = "lightgray";
	arrowNext.style.cursor = "auto";
}

/* 
 *	***************** Special Pages ***************
 */

if (pageNumber == ''){
	const pagination =
	document.querySelector(".w3-display-bottommiddle");
	pagination.style.display = "none";
}
