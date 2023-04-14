import "../Form/form.css";

import Button from "react-bootstrap/Button";
import Col from "react-bootstrap/Col";
import Form from "react-bootstrap/Form";
import Row from "react-bootstrap/Row";
import "bootstrap/dist/css/bootstrap.min.css";

const FormComm = () => {
  return (
    <div className="form-body">
      <div className="wrapper">
        <div className="formBox">
          <h2 className="formBoxH2">글쓰기</h2>
          <div className="inputForm">
            <Form className="formB">
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
              <Row className="justify-content-center">
                <Button
                  variant="danger"
                  type="submit"
                  style={{ width: "150px" }}
                >
                  작성
                </Button>
                <Button
                  variant="danger"
                  type="cancel"
                  style={{ width: "150px" }}
                >
                  이전
                </Button>
              </Row>
            </Form>
          </div>
        </div>
      </div>
    </div>
  );
};

export default FormComm;
