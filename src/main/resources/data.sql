INSERT INTO category (id, name, slug, image_url)
VALUES
(1, '카페', 'cafe', '/icons/cafe.png'),
(2, '상품권', 'gift-card', '/icons/giftcard.png'),
(3, '치킨', 'chicken', '/icons/chicken.png'),
(4, '피자·버거', 'pizza-burger', '/icons/pizza.png'),
(5, '편의점', 'convenience-store', '/icons/convenience.png'),
(6, '외식', 'dining', '/icons/dining.png'),
(7, '디저트', 'dessert', '/icons/dessert.png');
INSERT INTO brand (id, name, image_url, category_id, guidelines)
VALUES
(1, '스타벅스', '', 1, ''),
(2, '할리스', '', 1, ''),
(3, '파스쿠찌', '', 1, ''),
(4, '뚜레쥬르', '', 1, ''),
(5, '빽다방', '', 1, ''),
(6, '이디야커피', '', 1, ''),
(7, '컴포즈커피', '', 1, ''),
(8, '메가MGC커피', '/icons/megacoffee.png', 1, ''),
(9, '배스킨라빈스', '', 7, ''),
(10, '엔제리너스', '', 1, ''),
(11, '아티제', '', 1, ''),
(12, '카페베네', '', 1, ''),
(13, '공차', '', 1, ''),
(14, '더벤티', '', 1, ''),
(15, '하삼동커피', '', 1, ''),
(16, '매머드익스프레스', '', 1, ''),
(17, 'Wavve', '', 2, ''),
(18, '엔터식스', '', 2, ''),
(19, 'CJ기프트카드', '', 2, ''),
(20, '양키캔들', '', 2, ''),
(21, '블루샥', '', 1, ''),
(22, '커피빈', '', 1, ''),
(23, '바나프레소', '', 1, ''),
(24, '처갓집 양념치킨', '', 3, ''),
(25, '박가부대', '', 6, ''),
(26, '라그릴리아', '', 6, ''),
(27, '60계치킨', '', 3, ''),
(28, '푸라닭', '', 3, ''),
(29, '교촌치킨', '', 3, ''),
(30, '드롭탑', '', 1, ''),
(31, '비엔나커피하우스', '', 1, ''),
(32, '마호가니커피', '', 1, ''),
(33, '잠바주스', '', 1, ''),
(34, '파리바게뜨', '', 7, ''),
(35, '던킨', '', 7, ''),
(36, '크리스피크림도넛', '', 7, ''),
(37, '파리크라상', '', 7, ''),
(38, '신세계 상품권', '', 2, ''),
(39, '컬쳐랜드', '', 2, ''),
(40, '이마트 금액권', '', 2, ''),
(41, '올리브영', '', 2, ''),
(42, '도미노피자', '', 4, ''),
(43, '노브랜드버거', '', 4, ''),
(44, '피자마루', '', 4, ''),
(45, '파파존스', '', 4, ''),
(46, 'CGV', '', 2, ''),
(47, 'CJ푸드빌', '', 2, ''),
(48, 'BHC', '', 3, ''),
(49, 'BBQ', '', 3, ''),
(50, '치킨신드롬', '', 3, ''),
(51, 'GS25', '', 5, ''),
(52, '이마트24', '', 5, ''),
(53, '아웃백', '', 6, ''),
(54, '소소떡볶이', '', 6, ''),
(55, '놀부', '', 6, ''),
(56, '굽네치킨', '', 3, ''),
(57, '멕시카나치킨', '', 3, ''),
(58, '롯데리아', '', 4, ''),
(59, '맥도날드', '', 4, ''),
(60, '피자헛', '', 4, ''),
(61, 'CU', '', 5, ''),
(62, '홍콩반점0410', '', 6, ''),
(63, '생어거스틴', '', 6, ''),
(64, '도레도레', '', 7, ''),
(65, '빚은', '', 7, '');
INSERT INTO product (id, name, price, expiration_days, brand_id)
VALUES
(1, '(ICE)아메리카노', 2000, 366, 8),
(2, '신세계이마트 1만원 상품권 교환권', 10000, 365, 38),
(3, '아메리카노(Ice)(TAKE-OUT)', 1500, 366, 7),
(4, '아이스 카페 아메리카노 T', 4500, 366, 1),
(5, '(HOT)아메리카노', 1500, 366, 8),
(6, '모바일문화상품권 1천원권', 1000, 366, 39),
(7, '모바일문화상품권 1만원권', 10000, 366, 39),
(8, '신세계이마트 5만원 상품권 교환권', 50000, 365, 38),
(9, 'CU모바일상품권 3,000원', 3000, 365, 61),
(10, '신세계이마트 3만원 상품권 교환권', 30000, 365, 38),
(11, '아메리카노(ICED)', 2000, 366, 5);
