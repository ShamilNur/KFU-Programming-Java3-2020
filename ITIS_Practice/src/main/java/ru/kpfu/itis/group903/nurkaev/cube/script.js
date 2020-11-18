document.addEventListener('DOMContentLoaded', () => {
    document.querySelector('.btn-start').addEventListener('click', e => {
        let square = document.querySelector('.square');
        square.style.left = window.getComputedStyle(square).left;
        square.style.top = window.getComputedStyle(square).top;

        const area = document.querySelector('.area');
        const areaHeight = window.getComputedStyle(area).height;
        const squareHeight = window.getComputedStyle(square).height;
        const areaWidth = window.getComputedStyle(area).width;
        const squareWidth = window.getComputedStyle(square).width;
        const timeout = 25;
        const shift = 4;
        
        rightTop();

        function rightTop() {
            let interval = window.setInterval(() => {
                square.style.left = parseInt(square.style.left) + shift + 'px';
                square.style.top = parseInt(square.style.top) - shift + 'px'
                if (parseInt(square.style.left) >= parseInt(areaWidth) - parseInt(squareWidth)) {
                    clearInterval(interval);
                    leftTop();
                } else if (parseInt(square.style.top) <= 0) {
                    clearInterval(interval);
                    rightBottom();
                }
            }, timeout);
        }

        function rightBottom() {
            let interval = window.setInterval(() => {
                square.style.left = parseInt(square.style.left) + shift + 'px';
                square.style.top = parseInt(square.style.top) + shift + 'px'
                if (parseInt(square.style.left) >= parseInt(areaWidth) - parseInt(squareWidth)) {
                    clearInterval(interval);
                    leftBottom();
                } else if (parseInt(square.style.top) >= parseInt(areaHeight) - parseInt(squareHeight)) {
                    clearInterval(interval);
                    rightTop();
                }
            }, timeout);
        }

        function leftTop() {
            let interval = window.setInterval(() => {
                square.style.left = parseInt(square.style.left) - shift + 'px';
                square.style.top = parseInt(square.style.top) - shift + 'px'
                if (parseInt(square.style.left) <= 0) {
                    clearInterval(interval);
                    rightTop();
                } else if (parseInt(square.style.top) <= 0) {
                    clearInterval(interval);
                    leftBottom();
                }
            }, timeout);
        }

        function leftBottom() {
            let interval = window.setInterval(() => {
                square.style.left = parseInt(square.style.left) - shift + 'px';
                square.style.top = parseInt(square.style.top) + shift + 'px'
                if (parseInt(square.style.left) <= 0) {
                    clearInterval(interval);
                    rightBottom();
                } else if (parseInt(square.style.top) >= parseInt(areaHeight) - parseInt(squareHeight)) {
                    clearInterval(interval);
                    leftTop();
                }
            }, timeout);
        }
    })
});