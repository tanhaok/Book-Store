import HomeStyle from "./page.module.css";

const Home = () => {
  return (
    <div className={HomeStyle.home}>
      <div className="d-flex flex-column justify-content-center w-100 h-100">
        <div className="d-flex flex-column justify-content-center align-items-center">
          <h1 className="fw-light text-white m-0">
            Hello, Welcome to Book Store Management System
          </h1>
          <div className="btn-group my-5">
            <button className="btn btn-outline-light">
             Log In To Continue 
            </button>
          </div>
          <div className="text-decoration-none">
            <h5 className="fw-light text-white m-0">— Develop by @tanhaok —</h5>
          </div>
        </div>
      </div>
    </div>
  );
};

export default Home;
