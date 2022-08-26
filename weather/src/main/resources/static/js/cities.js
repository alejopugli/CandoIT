$(document).ready(function () {
  loadCities();
});

async function loadCities() {
  const request = await fetch("api/get_cities", {
    method: "GET",
    headers: {
      Accept: "application/json",
      "Content-Type": "application/json",
    },
  });
  const cities = await request.json();

  let citiesList = "";
  for (let city of cities) {
    let cityRow =
      "<tr><td>" + city.name + "</td><td>" + city.weather.tempDesc+ "</td><td>" + city.weather.description + "</td></tr>";
    citiesList += cityRow;
  }
  
  document.querySelector("#Ciudades tbody").outerHTML = citiesList;
}
