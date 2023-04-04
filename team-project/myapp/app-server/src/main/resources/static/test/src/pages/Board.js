import { Link } from "react-router-dom";
import logo from "../img/logo.png";
import Instagram from "../img/Instagram.png";
import twitter from "../img/twitter.png";
import telegram from "../img/telegram.png";
import Discord from "../img/Discord.png";
import index from "./index.module.css";
import board from "./board.module.css";
// import "./pagination";

const Board = () => {
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

        <div className={index.body}>
          <div className={index.cate}>
            <ul className={index.list}>
              <li className={index.listLi}>HOT 플레이스</li>
              <li className={index.listLi}>커뮤니티</li>
            </ul>
          </div>
          <div className={board.boardCate}>
            <ul className={board.boardList}>
              <li className={board.boardListLi}>자유</li>
              <li className={board.boardListLi}>Q&A</li>
              <li className={board.boardListLi}>맛집&이색카페</li>
              <li className={board.boardListLi}>여행 정보</li>
              <li className={board.boardListLi}>여행 동행</li>
            </ul>
          </div>
          <div className="board-main">
            <ul className="boardbox">
              <table
                summary="This table shows how to create responsive tables using Datatables' extended functionality"
                className="table table-bordered table-hover dt-responsive"
                id="board-table"
              >
                <thead className={board.booardHead}>
                  <tr>
                    <th width="100px">번호</th>
                    <th>제목</th>
                    <th width="300px">글쓴이 </th>
                    <th width="100px">추천수</th>
                    <th width="150px">작성일</th>
                    <th width="100px">조회수</th>
                  </tr>
                </thead>
                <tbody>
                  <tr>
                    <td>1</td>
                    <td>
                      <a href="view.html?no={{no}}">제목없음</a>
                    </td>
                    <td>nickname</td>
                    <td>1234</td>
                    <td>2023.02.03</td>
                    <td>2</td>
                  </tr>
                  <tr>
                    <td>2</td>
                    <td>
                      <a href="view.html?no={{no}}">제목없음</a>
                    </td>
                    <td>nickname</td>
                    <td>1234</td>
                    <td>2023.02.03</td>
                    <td>2</td>
                  </tr>
                  <tr>
                    <td>3</td>
                    <td>
                      <a href="view.html?no={{no}}">제목없음</a>
                    </td>
                    <td>nickname</td>
                    <td>1234</td>
                    <td>2023.02.03</td>
                    <td>2</td>
                  </tr>
                  <tr>
                    <td>4</td>
                    <td>
                      <a href="view.html?no={{no}}">제목없음</a>
                    </td>
                    <td>nickname</td>
                    <td>1234</td>
                    <td>2023.02.03</td>
                    <td>2</td>
                  </tr>
                  <tr>
                    <td>5</td>
                    <td>
                      <a href="view.html?no={{no}}">제목없음</a>
                    </td>
                    <td>nickname</td>
                    <td>1234</td>
                    <td>2023.02.03</td>
                    <td>2</td>
                  </tr>
                </tbody>
              </table>
            </ul>
          </div>

          <div className="_1-iJ">
            {/* <svg viewBox="0 0 16 16" className="_3XWQ">
            <path
              fill="none"
              stroke="currentColor"
              strokeWidth="1.5"
              d="M6.562 1.5c2.567 0 4.647 2.07 4.647 4.635 0 2.566-2.08 4.646-4.647 4.646s-4.647-2.08-4.647-4.646c0-2.566 2.08-4.635 4.647-4.635zM12.773 12.68L14.6 14.506"
            ></path>
          </svg> */}
            <input
              type="text"
              placeholder="Search"
              aria-label="Search"
              className="_3fLk"
            />
            <button type="submit" className="_2zEK">
              <svg viewBox="0 0 16 16" className="_3XWQ">
                <path
                  fill="none"
                  stroke="currentColor"
                  strokeWidth="1.5"
                  d="M13.51 13.51l-2.263-2.263"
                ></path>
              </svg>
            </button>
          </div>

          <div className="pagination">
            <ul></ul>
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

export default Board;
