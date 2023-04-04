import { Link } from "react-router-dom";
import Button from "react-bootstrap/Button";
import Col from "react-bootstrap/Col";
import Form from "react-bootstrap/Form";
import Row from "react-bootstrap/Row";
import FloatingLabel from "react-bootstrap/FloatingLabel";

import index from "./index.module.css";
import insert from "./insert.module.css";
import logo from "../img/logo.png";
import Instagram from "../img/Instagram.png";
import twitter from "../img/twitter.png";
import telegram from "../img/telegram.png";
import Discord from "../img/Discord.png";

const Form1 = () => {
  return (
    <div className={index.main}>
      <div className={index.container}>
        <div className={index.header}>
          <div className={index.headerHead}>
            <img src={logo} className={index.logo} alt="logo"></img>
            <p className={index.headerHeadP} id="logo">
              여긴 좋아
            </p>
          </div>
          <div className="header-middle">
            <form className="input-text">
              <input
                type="text"
                className={index.search}
                placeholder="Search Item More"
              />
            </form>
          </div>
          <div className={index.headerTail}>
            <ul className={index.headerTailUl}>
              <li
                className={`${index.signup} ${index.signupI} ${index.headerTailUlLi}`}
                id="signup"
              >
                <Link to="/insert">Create</Link>
              </li>
              <li
                className={`${index.login} ${index.loginI} ${index.headerTailUlLi}`}
                id="login"
              >
                {/* 로그인 */}
                <Link to="/about">Connect</Link>
              </li>
              <li
                className={`${index.logout} ${index.logoutI} ${index.headerTailUlLi}`}
                id="logout"
              >
                <a href="app/auth/logout" onclick="logout(); return false;">
                  로그아웃(<span id="nickname"></span>)
                </a>
              </li>
            </ul>
          </div>
        </div>

        <div className={insert.body}>
          <div className={insert.wrapperForm}>
            <p className={insert.formTitle}>커뮤니티 게시글</p>
            <Form className={insert.formB}>
              <Row className="mb-3">
                <Form.Group as={Col} controlId="formGridState">
                  <Form.Label>카테고리</Form.Label>
                  <Form.Select style={{ width: "300px" }} defaultValue="자유">
                    <option>자유</option>
                    <option>Q&A</option>
                    <option>맛집&이색 카페</option>
                    <option>여행 정보</option>
                    <option>여행 동행</option>
                  </Form.Select>
                </Form.Group>

                <Form.Group as={Col} controlId="formGridCity">
                  <Form.Label>제목</Form.Label>
                  <Form.Control style={{ width: "700px" }} />
                </Form.Group>

                <Form.Group controlId="formFileMultiple" className="mb-3">
                  <Form.Label>파일 업로드</Form.Label>
                  <Form.Control type="file" multiple />
                </Form.Group>

                {/* <FloatingLabel>
                  <Form.Control
                    as="textarea"
                    placeholder="Leave a comment here"
                    style={{ height: "350px" }}
                  />
                </FloatingLabel> */}

                <Form.Group
                  className="mb-3"
                  controlId="exampleForm.ControlTextarea1"
                >
                  <Form.Label>내용</Form.Label>
                  <Form.Control as="textarea" style={{ height: "280px" }} />
                </Form.Group>
              </Row>

              <Button variant="danger" type="submit" style={{ width: "100px" }}>
                작성
              </Button>
            </Form>
          </div>
        </div>

        <div className={index.footer}>
          <div className={index.footerMain}>
            <div>
              <ul className={`${index.mainF} ${index.footerMainUl}`}>
                <li className={`${index.ff} ${index.footerMainUlLi}`}>
                  <img src={logo} className={index.logo} alt="logo"></img>
                  <span>여긴 좋아</span>
                </li>
                <li className={`${index.fs} ${index.footerMainUlLi}`}>
                  Get the lates Updates
                </li>
              </ul>
            </div>
            <div>
              <ul className={`${index.mainS} ${index.footerMainUl}`}>
                <li className={`${index.sf} ${index.footerMainUlLi}`}>
                  가나다라
                </li>
                <li className={`${index.ss} ${index.footerMainUlLi}`}>
                  가나다
                </li>
              </ul>
            </div>
            <div>
              <ul className={`${index.mainT} ${index.footerMainUl}`}>
                <li className={`${index.tf} ${index.footerMainUlLi}`}>
                  Support
                </li>
                <li className={`${index.ts} ${index.footerMainUlLi}`}>
                  Help center
                </li>
                <li className={`${index.tt} ${index.footerMainUlLi}`}>
                  Terms of service
                </li>
              </ul>
            </div>
          </div>
          <div className={index.footerTail}>
            <div className={index.footerTailLeft}>여긴 좋아,lnc.All Rights</div>
            <div className={index.footerTailRight}>
              <img src={Instagram} className={index.insta} alt="Instagram" />
              <img src={twitter} className={index.twi} alt="twitter" />
              <img src={telegram} className={index.tele} alt="telegram" />
              <img src={Discord} className={index.disc} alt="Discord" />
            </div>
          </div>
        </div>
      </div>
    </div>
  );
};

export default Form1;
