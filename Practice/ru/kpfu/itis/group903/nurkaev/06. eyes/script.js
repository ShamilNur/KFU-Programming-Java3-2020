document.addEventListener('DOMContentLoaded', () => {

    document.addEventListener('mousemove', event => {
        let pupils = document.getElementsByClassName('pupil');

        let x = (event.x / window.innerWidth) * 100 + '%';
        let y = (event.y / window.innerHeight) * 100 + '%';

        for (let i = 0; i < 2; i++) {
            pupils[i].style.left = x;
            pupils[i].style.top = y;
            /*чтобы центр зрачка совпадал с центром глаза (элемента и родителя)*/
            pupils[i].style.transform = 'translate(-' + x + ', -' + y + ')';
        }
    })

});
