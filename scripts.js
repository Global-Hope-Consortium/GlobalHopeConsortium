/* // scripts.js
// Select DOM elements
const hamburger = document.querySelector('.hamburger');
const navLinks = document.querySelector('.nav-links');

// Toggle navigation menu and animate hamburger lines
hamburger.addEventListener('click', () => {
    navLinks.classList.toggle('active');
    hamburger.classList.toggle('active');
});
gsap.from(".heading", { duration: 1, y: -50, opacity: 0 });
 */
// Toggle hamburger menu
document.querySelector('.hamburger').addEventListener('click', () => {
document.querySelector('.navbar').classList.toggle('active');
});

// Sample data for demo content
const data = [
    {
        place:'Switzerland Alps',
        title:'SAINT',
        title2:'ANTONIEN',
        description:'Tucked away in the Switzerland Alps...',
        image:'https://assets.codepen.io/3685267/timed-cards-1.jpg'
    },
    // Add more destination data here...
];

const _ = (id) => document.getElementById(id);
const cards = data.map((i, index) => `<div class="card" id="card${index}" style="background-image:url(${i.image})"></div>`).join('');
const cardContents = data.map((i, index) => `<div class="card-content" id="card-content-${index}"><div class="content-start"></div><div class="content-place">${i.place}</div><div class="content-title-1">${i.title}</div><div class="content-title-2">${i.title2}</div></div>`).join('');
const slideNumbers = data.map((_, index) => `<div class="item" id="slide-item-${index}">${index + 1}</div>`).join('');

_('demo').innerHTML = cards + cardContents;
_('slide-numbers').innerHTML = slideNumbers;

// GSAP animation (can be added later for smoother transitions)